package com.example.homework342;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PeopleFragment extends Fragment {
    private ArrayList<String> people;
    private RecyclerView recyclerView;
    private PersonAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_people, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadPeople();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new PersonAdapter(people);
        recyclerView.setAdapter(adapter);
    }

    private void loadPeople() {
        people = new ArrayList<>();
        people.add("Мама");
        people.add("Папа");
        people.add("Рашид");
        people.add("Бабушка");
        people.add("Дедушка");
        people.add("Матай");
        people.add("Дима");
        people.add("Дастан");
        people.add("Арстан");
        people.add("Саша");

    }
}