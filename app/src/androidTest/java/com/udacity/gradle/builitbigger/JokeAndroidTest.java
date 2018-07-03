package com.udacity.gradle.builitbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import com.example.javajokes.Joker;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class JokeAndroidTest {
    private static final String TAG = JokeAndroidTest.class.getSimpleName();

    @Test
    public void testOnPostExecute() throws ExecutionException, InterruptedException, TimeoutException {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        Pair pair = new Pair(InstrumentationRegistry.getContext(), null);
        task.execute(pair);
        Joker joker = new Joker();
        String joke = joker.getJoke();
        String result = task.get(10, TimeUnit.SECONDS);
        assertEquals(joke, result);
    }
}