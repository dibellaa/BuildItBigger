package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements EndpointsAsyncTask.FragmentListener{

    private ProgressBar mLoadingProgressBar;
    private Button mButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        mLoadingProgressBar = root.findViewById(R.id.loading_pb);
        mButton = root.findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EndpointsAsyncTask task = new EndpointsAsyncTask();
                Pair pair = new Pair(getContext(), MainActivityFragment.this);
                task.execute(pair);
                mLoadingProgressBar.setVisibility(View.VISIBLE);
            }
        });
        return root;
    }

    @Override
    public void hideProgressBar() {
        mLoadingProgressBar.setVisibility(View.GONE);
    }
}
