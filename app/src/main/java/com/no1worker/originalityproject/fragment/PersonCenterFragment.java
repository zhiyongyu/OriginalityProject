package com.no1worker.originalityproject.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.no1worker.common.CommonFragment;
import com.no1worker.originalityproject.R;

/**
 * 个人中心页面
 * Created by yuzhiyong on 2019/5/21.
 */

public class PersonCenterFragment extends CommonFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_person_center,container,false);
        return contentView;
    }
}
