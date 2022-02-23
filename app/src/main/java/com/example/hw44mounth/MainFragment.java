package com.example.hw44mounth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private MainAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList <String> appdata;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loudData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new MainAdapter(appdata);
        recyclerView.setAdapter(adapter);
    }

    private void loudData() {
        appdata = new ArrayList<>();
        appdata.add("Kolobok");
        appdata.add("Matay");
        appdata.add("Azamat");
        appdata.add("Dastan");
        appdata.add("Arstan");
        appdata.add("Beksultan");
    }
}