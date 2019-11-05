package com.example.interview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.interview.databinding.ListItemBinding;
import com.example.interview.model.FbModel;

import java.util.List;

public class FbListAdapter extends RecyclerView.Adapter<FbListAdapter.FbItemViewHolder> {

    List<FbModel> fbModelList;
    Context context;
    public FbListAdapter(Context context,List<FbModel> fbModelList) {
        this.fbModelList =  fbModelList;
        this.context = context;
    }
    public void setFbModelList(List<FbModel> fbModelList){
        this.fbModelList =  fbModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FbItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ListItemBinding itemBinding =
                ListItemBinding.inflate(layoutInflater, parent, false);

        return new FbItemViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FbItemViewHolder holder, int position) {

        FbModel fbModel = fbModelList.get(position);
        holder.binding.name.setText(fbModel.getName());
        holder.binding.time.setText(fbModel.getTime());
        holder.binding.postMsg.setText(fbModel.getMsg());
        holder.binding.likecount.setText(fbModel.getLikecount()+ " Likes");
        holder.binding.shareCount.setText(fbModel.getSharecount()+" sharings");
        holder.binding.commentCount.setText(fbModel.getCommentcount()+" comments");

        Glide.with(context).load(fbModel.getProfileImage()).into(holder.binding.profile);
        Glide.with(context).load(fbModel.getProfileImage()).into(holder.binding.postImage);



    }

    @Override
    public int getItemCount() {
        return fbModelList.size();
    }

    class FbItemViewHolder extends RecyclerView.ViewHolder{

        private final ListItemBinding binding;


        public FbItemViewHolder(@NonNull ListItemBinding binding)
        {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
