package kg.shtraf.shtrafkg.ui.fines;

import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.TextView;

import java.util.List;

import kg.shtraf.shtrafkg.R;
import kg.shtraf.shtrafkg.model.Result;

/**
 * Created by User on 01.06.2018.
 */

public class FinesAdapter extends RecyclerView.Adapter<FinesAdapter.ViewHolder> {

    private List<Result> results;

    public FinesAdapter(List<Result> results) {
        this.results = results;
    }
    public void setList(List<Result> newResults){
        results = newResults;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_result, parent, false);

        return new ViewHolder((android.view.View) itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(results.get(position));
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvDocumentCode;
        TextView tvViolationDate;
        TextView tvViolationLocation;
        TextView tvArticle;
        TextView tvArticleDescription;
        TextView tvViolationFine;
        TextView tvPayed;
        TextView tvAmountToPay;

        public ViewHolder(android.view.View itemView) {
            super(itemView);

            tvDocumentCode = itemView.findViewById(R.id.tvDocumentCode);
            tvViolationDate = itemView.findViewById(R.id.tvViolationDate);
            tvViolationLocation = itemView.findViewById(R.id.tvViolationLocation);
            tvArticle = itemView.findViewById(R.id.tvArticle);
            tvArticleDescription = itemView.findViewById(R.id.tvArticleDescription);
            tvViolationFine = itemView.findViewById(R.id.tvViolationFine);
            tvPayed = itemView.findViewById(R.id.tvPayed);
            tvAmountToPay = itemView.findViewById(R.id.tvAmountToPay);

        }

        void bind(Result result){
            tvDocumentCode.setText(result.getDocumentCode());
            tvViolationDate.setText(result.getViolationDate());
            tvViolationLocation.setText(result.getViolationLocation());
            tvArticle.setText(result.getArticle());
            tvArticleDescription.setText(result.getArticleDescription());
            tvViolationFine.setText(result.getViolationFine());
            tvPayed.setText(result.getPayed());
            tvAmountToPay.setText(result.getAmountToPay());
        }

    }
}
