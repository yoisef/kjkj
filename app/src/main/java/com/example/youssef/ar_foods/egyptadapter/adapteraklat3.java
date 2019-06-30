package com.example.youssef.ar_foods.egyptadapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.youssef.ar_foods.GlideApp;
import com.example.youssef.ar_foods.R;
import com.example.youssef.ar_foods.fooddetail;
import com.example.youssef.ar_foods.foodsnames;
import com.example.youssef.ar_foods.foodtypes;

import java.util.ArrayList;

public class adapteraklat3 extends RecyclerView.Adapter<adapteraklat3.viewholder>{
    Context context;



    ArrayList<foodtypes> listtypes,main,side;
    Activity activity;

    public adapteraklat3(Context con, ArrayList<foodtypes> myliste)
    {
        this.context=con;
        this.listtypes=myliste;

        main=new ArrayList<>();
        side=new ArrayList<>();
        /*

*/
        side.add(new foodtypes(R.drawable.soup,"be"));
        side.add(new foodtypes(R.drawable.soup,"be"));
        side.add(new foodtypes(R.drawable.soup,"be"));
        side.add(new foodtypes(R.drawable.soup,"be"));




    }



    @NonNull
    @Override
    public adapteraklat3.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview= LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.typerow,parent,false);
        return new adapteraklat3.viewholder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull final adapteraklat3.viewholder holder, int position) {

        GlideApp
                .with(context)
                .load(listtypes.get(position).getImageView())
                .centerCrop()
                .into(holder.imagetype);
        holder.texttype.setText(listtypes.get(position).getTypename());
        holder.mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int pos=holder.getAdapterPosition();

                switch (pos)
                {
                    case 0:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",31);
                        context.startActivity(intent);
                        break;
                    }

                    case 1:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",32);
                        context.startActivity(intent);
                        break;

                    }
                    case 2:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",33);
                        context.startActivity(intent);
                        break;

                    }
                    case 3:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",34);
                        context.startActivity(intent);
                        break;

                    }
                    case 4:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",35);
                        context.startActivity(intent);
                        break;

                    }
                    case 5:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",36);
                        context.startActivity(intent);
                        break;

                    }
                    case 6:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",37);
                        context.startActivity(intent);
                        break;

                    }
                    case 7:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",38);
                        context.startActivity(intent);
                        break;
                    }
                    case 8:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",39);
                        context.startActivity(intent);
                        break;

                    }
                    case 9:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",310);
                        context.startActivity(intent);
                        break;

                    }
                    case 10:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",311);
                        context.startActivity(intent);
                        break;

                    }
                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return listtypes.size();
    }

    class viewholder extends RecyclerView.ViewHolder{

        ImageView imagetype;
        TextView texttype;
        CardView mycard;

        public viewholder(View itemView) {
            super(itemView);

            imagetype=itemView.findViewById(R.id.imgty);
            texttype=itemView.findViewById(R.id.textty);
            mycard=itemView.findViewById(R.id.cardtype);

        }
    }
}
