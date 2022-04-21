package com.example.imo_contact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myRecyclerView;
    private List<Contact> lstContact;

    public FragmentContact(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myRecyclerView = (RecyclerView) v.findViewById(R.id.contact_recycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Mark Thompson","(+998) 97 2232255", R.drawable.user2));
        lstContact.add(new Contact("Elon Musk","(+998) 97 2232255", R.drawable.user3));
        lstContact.add(new Contact("Tom Cruise","(+998) 97 2232255", R.drawable.user2));
        lstContact.add(new Contact("Kevin Thompson","(+998) 97 2232255", R.drawable.user3));
        lstContact.add(new Contact("Mark Thompson","(+998) 97 2232255", R.drawable.user2));
        lstContact.add(new Contact("Mark Thompson","(+998) 97 2232255", R.drawable.user3));
        lstContact.add(new Contact("Zayn Kim","(+998) 97 2232255", R.drawable.user2));
        lstContact.add(new Contact("Henry Cavil","(+998) 97 2232255", R.drawable.user3));
        lstContact.add(new Contact("Tom Cruise","(+998) 97 2232255", R.drawable.user2));
        lstContact.add(new Contact("Kevin Thompson","(+998) 97 2232255", R.drawable.user3));
        lstContact.add(new Contact("Mark Thompson","(+998) 97 2232255", R.drawable.user2));
        lstContact.add(new Contact("Mark Thompson","(+998) 97 2232255", R.drawable.user3));

    }
}
