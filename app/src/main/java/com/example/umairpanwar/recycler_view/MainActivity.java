package com.example.umairpanwar.recycler_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView mreclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context=this;
        mreclerview=findViewById(R.id.mRecyclerView);
        mreclerview.setLayoutManager(new LinearLayoutManager(this));
        OurAdapter adapter = new OurAdapter();
        mreclerview.setAdapter(adapter);

    }
    public class OurAdapter extends RecyclerView.Adapter<OurAdapter.ViewHolder>{
        DataModel [] dataModels = new DataModel[10];
        public OurAdapter(){
            dataModels[0] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[1] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[2] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[3] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[4] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[5] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[6] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[7] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[8] = new DataModel("fghg",5,R.drawable.abc);
            dataModels[9] = new DataModel("fghg",5,R.drawable.abc);
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            DataModel item=dataModels[position];
            holder.textViewname.setText(item.getName());
            holder.textViewcellno.setText(String.valueOf(item.getCellno()));
            holder.imageView.setImageResource(item.getImage());
        }

        @Override
        public int getItemCount() {
            return dataModels.length;
        }

       public class ViewHolder extends RecyclerView.ViewHolder{
            TextView textViewname;
            TextView textViewcellno;
            ImageView imageView;
            public ViewHolder(View itemView) {
                super(itemView);
                textViewname = itemView.findViewById(R.id.mTextView);
                textViewcellno = itemView.findViewById(R.id.mTextView2);
                imageView = itemView.findViewById(R.id.mImageView);
            }
        }
    }
    public class DataModel{
     private    String name;
     private    int cellno;
     private    int image;

        public DataModel(String name, int cellno, int image) {
            this.name = name;
            this.cellno = cellno;
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCellno() {
            return cellno;
        }

        public void setCellno(int cellno) {
            this.cellno = cellno;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }
}
