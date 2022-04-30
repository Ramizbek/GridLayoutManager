package ramizbek.aliyev.a132.adapders

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ramizbek.aliyev.a132.models.User
import kotlinx.android.synthetic.main.item_array.view.*
import ramizbek.aliyev.a132.R

class UserAdapter(private var list: List<User>) : RecyclerView.Adapter<UserAdapter.Vh>() {

    @SuppressLint("SetTextI18n")
    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(user: User) {
            itemView.item_name.text = user.name
            itemView.item_icon.setImageResource(user.icon)
            when (user.name) {
                "Automotive" -> itemView.item_back.setBackgroundColor(Color.parseColor("#CE5E38"))
                "Batteries" -> itemView.item_back.setBackgroundColor(Color.parseColor("#A4622E"))
                "Construction" -> itemView.item_back.setBackgroundColor(Color.parseColor("#B48B36"))
                "Electronics" -> itemView.item_back.setBackgroundColor(Color.parseColor("#C0B23C"))
                "Garden" -> itemView.item_back.setBackgroundColor(Color.parseColor("#728E3E"))
                "Glass" -> itemView.item_back.setBackgroundColor(Color.parseColor("#3B806C"))
                "Hazardous" -> itemView.item_back.setBackgroundColor(Color.parseColor("#366F96"))
                "Household" -> itemView.item_back.setBackgroundColor(Color.parseColor("#215792"))
                "Metal" -> itemView.item_back.setBackgroundColor(Color.parseColor("#513F67"))
                "Paint" -> itemView.item_back.setBackgroundColor(Color.parseColor("#703960"))
                "Paper" -> itemView.item_back.setBackgroundColor(Color.parseColor("#933D60"))
                "Plastic" -> itemView.item_back.setBackgroundColor(Color.parseColor("#B7544E"))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_array, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}