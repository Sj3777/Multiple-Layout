package com.example.multiplelayoutrecyclerview;

public class Model {
    public Model() {
    }

    String msg;
    int type;
    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Model(String msg, int type, int image) {
        this.msg = msg;
        this.type = type;
        this.image=image;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
