package com.example.t3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<modelactivity> userlist;

    public Adapter (List<modelactivity>userlist){
        this .userlist=userlist;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resourse= userlist.get(position).getImageview1();
        String name=userlist.get(position).getHero_name();

        holder.setData(resourse,name);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageview;
        private TextView textview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview=itemView.findViewById(R.id.imageview);
            textview=itemView.findViewById(R.id.hero_name);
        }

        public void setData(int resourse, String name) {

            imageview.setImageResource(resourse);
            textview.setText(name);
        }
    }
}
