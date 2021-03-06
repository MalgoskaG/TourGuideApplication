package com.musicstructureapp.android.tourguideapplication.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.musicstructureapp.android.tourguideapplication.Adapters.ItemsAdapter;
import com.musicstructureapp.android.tourguideapplication.Models.ItemModel;
import com.musicstructureapp.android.tourguideapplication.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFrag extends Fragment {

    RecyclerView mRecyclerView;
    ItemsAdapter mListAdapter;
    ArrayList<ItemModel> attraction;


    public AttractionsFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.list_layout, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerV);
        getItemsList();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mListAdapter = new ItemsAdapter(getContext(), attraction, mRecyclerView);
        mRecyclerView.setAdapter(mListAdapter);

        return view;
    }

    public void getItemsList() {
        attraction = new ArrayList<>();

        attraction.add(new ItemModel(R.string.lorem, R.drawable.attr1, R.string.attr));
        attraction.add(new ItemModel(R.string.lorem, R.drawable.attr2, R.string.attr));
        attraction.add(new ItemModel(R.string.lorem, R.drawable.attr3, R.string.attr));

    }
}
