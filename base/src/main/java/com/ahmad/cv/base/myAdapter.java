package com.ahmad.cv.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> {

    private final LinkedList<String> skillList;
    private LayoutInflater myInflater;
    public myAdapter(Context context, LinkedList<String> wordList) {
        myInflater = LayoutInflater.from(context);
        this.skillList = wordList;
    }
    @NonNull
    @Override
    public myAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = myInflater.inflate(R.layout.skills, parent, false);
        return new myViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.myViewHolder holder, int position) {
        String mCurrent = skillList.get(position);
        holder.mySkills.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return this.skillList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        public final TextView mySkills;
        final myAdapter adapter;
        public myViewHolder(View skills, myAdapter adapter) {
            super(skills);
            mySkills = skills.findViewById(R.id.word);
            this.adapter = adapter;
        }
    }
}
