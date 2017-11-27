package com.example.maopao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Integer[] arr={5,3,2,6,1,4};
        for (int i = 0; i < arr.length; i++) {
            int tem;
            boolean flag=false;
            for (int j = 0; j <arr.length-1; j++) {

                if(arr[j]<arr[j+1]){
                    tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //ceshi
    //你妹的
}
