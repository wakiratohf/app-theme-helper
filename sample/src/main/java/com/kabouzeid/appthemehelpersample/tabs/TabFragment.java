package com.kabouzeid.appthemehelpersample.tabs;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kabouzeid.appthemehelpersample.R;

/**
 * @author Aidan Follestad (afollestad)
 */
public class TabFragment extends Fragment {

    public static TabFragment create(int position) {
        Bundle args = new Bundle();
        args.putInt("position", position);
        TabFragment fragment = new TabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView view = (TextView) inflater.inflate(R.layout.fragment_tab, container, false);
        view.setText(String.format("TAB %d", getArguments().getInt("position")));
        return view;
    }
}