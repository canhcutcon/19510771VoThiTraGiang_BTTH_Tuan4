package com.example.a19510771vothitragiang_btth_tuan4.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a19510771vothitragiang_btth_tuan4.R;
import com.example.a19510771vothitragiang_btth_tuan4.model.Product;
import com.example.a19510771vothitragiang_btth_tuan4.adapter.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductListViewActivity extends AppCompatActivity {
    private List<Product> productList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        productList = new ArrayList<>();
        productList.add(new Product(1, "Ca nấu lẩu,nấu mì mini..","Devang"));
        productList.add(new Product(2, "1KG KHÔ GÀ BƠ TỎI","LTD Foot"));
        productList.add(new Product(3, "Xe cần cẩu đa năng","Thế giới đồ chơi"));
        productList.add(new Product(4, "Đồ chơi dạng mô hình","Thế giới đồ chơi"));
        productList.add(new Product(5, "Lảnh đạo đơn giản","Minh Long Book"));
        productList.add(new Product(6, "Hiểu lòng trẻ con","Minh Long Book"));

        ProductAdapter adapter = new ProductAdapter(this, R.layout.item_list_view, productList);
        listView.setAdapter(adapter);

    }
}