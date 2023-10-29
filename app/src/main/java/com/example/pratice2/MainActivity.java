package com.example.pratice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pratice2.adapter.mycustomadapter;
import com.example.pratice2.model.wwemodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Itemclicklistner {
    RecyclerView recyclerView;
    mycustomadapter mycustomadapter;
    List<wwemodel> wwemodelList;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView1);
        wwemodelList=new ArrayList<>();
        mycustomadapter=new mycustomadapter(wwemodelList);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,staggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(mycustomadapter);
        mycustomadapter.Itemclicklistner(this);
        IntializeDataintoRecycleview();
    }
private void  IntializeDataintoRecycleview(){
        wwemodel c1=new wwemodel("randy orton",9,R.drawable.image1);
        wwemodel c2=new wwemodel("randy orton2",9,R.drawable.image2);
        wwemodel c3=new wwemodel("randy orton3",9,R.drawable.taj);
        wwemodel c4=new wwemodel("randy orton",9,R.drawable.wwe);
        wwemodel c5=new wwemodel("randy orton",9,R.drawable.image1);
        wwemodelList.add(c1);
        wwemodelList.add(c2);
        wwemodelList.add(c3);
        wwemodelList.add(c4);
        wwemodelList.add(c5);
       mycustomadapter.notifyDataSetChanged();

    }

    @Override
    public void onclick(View v, int position) {
        Toast.makeText(this, "u clicked on"+wwemodelList.get(position).getPlayername()+"    rko", Toast.LENGTH_SHORT).show();

    }
}