package com.example.bhupalam.myapplication;

/**
 * Created by bhupalam on 3/24/2015.
 */

        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.ListFragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;
        import android.widget.Toast;

/**
 * Created by Dr.h3cker on 14/03/2015.
 */
public class tab1 extends ListFragment {
    private String Houses[];

    public tab1(){
        Houses=new String[] {"Stark","Lannister","Tyrell"};
    }

    public void setHouses(String[] houses) {
        Houses = houses;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListAdapter listAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, Houses);
        setListAdapter(listAdapter);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab1,container,false);
        return  view;
    }
    @Override
    public void onListItemClick(ListView list, View v, int position, long id) {
      //write what happens after clicking the list item
        Toast.makeText(getActivity(), getListView().getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
    }
}
