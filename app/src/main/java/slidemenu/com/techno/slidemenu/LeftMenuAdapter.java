package slidemenu.com.techno.slidemenu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by arbaz on 20/5/17.
 */

public class LeftMenuAdapter extends RecyclerView.Adapter<LeftMenuAdapter.ViewHolder> {
    ArrayList<LeftMenuMain> leftMenuMainArrayList;
    Context context;
    LeftMenuMain leftMenuMain;


    public LeftMenuAdapter(ArrayList<LeftMenuMain> leftMenuMainArrayList, Context context) {
        this.leftMenuMainArrayList = leftMenuMainArrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.left_menu_row, parent, false));

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        leftMenuMain = leftMenuMainArrayList.get(position);
        try {
            holder.tvLeftMenu.setText(leftMenuMain.getStrMenuTitle());
            holder.ivLeftMenu.setImageResource(leftMenuMain.getImgId());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return leftMenuMainArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public TextView tvLeftMenu;
        public ImageView ivLeftMenu;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            tvLeftMenu = (TextView) view.findViewById(R.id.tvLeftMenu);
            ivLeftMenu = (ImageView) view.findViewById(R.id.ivLeftMenu);

        }
    }
}
