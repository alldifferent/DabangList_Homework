package com.alldi.dabanglist_homework.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.alldi.dabanglist_homework.R;
import com.alldi.dabanglist_homework.datas.Dabang;

import java.util.List;

public class DabangAdapter extends ArrayAdapter<Dabang> {

    Context mContext;
    List<Dabang> mList;
    LayoutInflater inf;

    public DabangAdapter(Context context, List<Dabang> list){
        super(context, R.layout.dabang_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.dabang_list_item, null);
        }

        Dabang dabangData = mList.get(position);

        TextView paymentTxt = row.findViewById(R.id.paymentTxt);
        TextView floorTxt = row.findViewById(R.id.floorTxt);
        TextView adressTxt = row.findViewById(R.id.adressTxt);
        TextView numroomTxt = row.findViewById(R.id.numroomTxt);
        TextView optionTxt = row.findViewById(R.id.optionTxt);

        paymentTxt.setText(String.format("%d/%d",dabangData.payment,dabangData.menthpayment));
        floorTxt.setText(String.format("%d층",dabangData.floor));
        adressTxt.setText(dabangData.adress);
        numroomTxt.setText(dabangData.numroom);
        optionTxt.setText(dabangData.optionroom);

        return row;

    }
}
