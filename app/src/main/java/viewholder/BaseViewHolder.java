package viewholder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by JasonChen on 2017/9/20.
 */

public abstract  class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public View itemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setUpView(T model, int position, RecyclerView.Adapter adapter);
}
