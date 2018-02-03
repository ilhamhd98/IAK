package com.powergeninfotech.iak_beginner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ilham on 2/3/18.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.RecyclerviewViewHolder> {

    private List<NewsPojo> list;

    @Override
    public RecyclerviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerviewViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(
                                R.layout.row_list_recyclerview, parent, false
                        )
        );
    }

    @Override
    public void onBindViewHolder(RecyclerviewViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    public void setData(List<NewsPojo> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerviewViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_image;
        private TextView tv_title;

        public RecyclerviewViewHolder(View itemView) {
            super(itemView);

            iv_image = itemView.findViewById(R.id.iv_image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }

        public void bind(NewsPojo newsPojo) {

            tv_title.setText(newsPojo.getTitle());

            Picasso.with(itemView.getContext())
                    .load(newsPojo.getLink_gambar())
                    .into(iv_image);
        }
    }
}
