package com.sata.izonovel.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sata.izonovel.Model.ListNovelResponseModel;
import com.sata.izonovel.R;

import java.util.List;

public class DaftarNovelAdapter extends RecyclerView.Adapter<DaftarNovelAdapter.AdapterHolder> {
    private Context context;
    private List<ListNovelResponseModel.Document> documentList;

    public DaftarNovelAdapter(Context context, List<ListNovelResponseModel.Document> documentList) {
        this.context = context;
        this.documentList = documentList;
    }

    @NonNull
    @Override
    public DaftarNovelAdapter.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_novel,parent,false);
        AdapterHolder holder = new AdapterHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DaftarNovelAdapter.AdapterHolder holder, int position) {
        final ListNovelResponseModel.Document document = documentList.get(position);
        String judulNovel = document.getJudul();
        holder.JudulNovel.setText(judulNovel);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AdapterHolder extends RecyclerView.ViewHolder{
        TextView JudulNovel,TahunDanPengarang,Sinopsis,Genre;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);
            JudulNovel = itemView.findViewById(R.id.tvJudulNovel);
            TahunDanPengarang = itemView.findViewById(R.id.tvTahunDanPengarang);
            Sinopsis = itemView.findViewById(R.id.tvSinopsis);
            Genre = itemView.findViewById(R.id.tvGenre);
        }
    }
}
