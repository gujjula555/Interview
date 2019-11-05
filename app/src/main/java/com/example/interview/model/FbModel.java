package com.example.interview.model;

import com.google.gson.annotations.SerializedName;

public class FbModel {
    @SerializedName("name")
   private String name;
    @SerializedName("profile_url")
    private String profileImage;
    @SerializedName("share_count")
    private String sharecount;
    @SerializedName("like_count")
    private String likecount;
    @SerializedName("comment_count")
    private String commentcount;
    @SerializedName("msg")
    private String msg;
    @SerializedName("postedtime")
    private String time;
    @SerializedName("post_image_url")
    private String postimage;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getSharecount() {
        return sharecount;
    }

    public void setSharecount(String sharecount) {
        this.sharecount = sharecount;
    }

    public String getLikecount() {
        return likecount;
    }

    public void setLikecount(String likecount) {
        this.likecount = likecount;
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPostimage() {
        return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }






}
