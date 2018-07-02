package com.example.jokelibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JokeActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JokeActivityFragment extends Fragment {
    public static final String ARG_JOKE = "joke";

    private String mJoke;

    public JokeActivityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param joke Parameter 1.
     * @return A new instance of fragment JokeActivityFragment.
     */
    public static JokeActivityFragment newInstance(String joke) {
        JokeActivityFragment fragment = new JokeActivityFragment();
        Bundle args = new Bundle();
        args.putString(ARG_JOKE, joke);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mJoke = getArguments().getString(ARG_JOKE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_joke_activity, container, false);

        Bundle extras = getActivity().getIntent().getExtras();
        String joke = null;
        if (extras != null && extras.containsKey(ARG_JOKE)) {
            joke = extras.getString(ARG_JOKE, "");
        }

        TextView jokeTv = rootView.findViewById(R.id.tv_joke);
        jokeTv.setText(joke);

        return rootView;
    }
}
