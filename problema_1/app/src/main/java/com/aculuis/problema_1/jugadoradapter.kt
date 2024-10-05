import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JugadorAdapter(private val listaJugadores: List<Jugador>) :
    RecyclerView.Adapter<JugadorAdapter.JugadorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_jugador, parent, false)
        return JugadorViewHolder(view)
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val jugador = listaJugadores[position]
        holder.nombreJugador.text = jugador.nombreCompleto
        holder.anoNacimientoJugador.text = jugador.anoNacimiento
        holder.edadJugador.text = jugador.edad.toString()
        holder.imagenJugador.setImageResource(jugador.imagenResId)
    }

    override fun getItemCount(): Int = listaJugadores.size

    class JugadorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagenJugador: ImageView = itemView.findViewById(R.id.imagenJugador)
        val nombreJugador: TextView = itemView.findViewById(R.id.nombreJugador)
        val anoNacimientoJugador: TextView = itemView.findViewById(R.id.anoNacimientoJugador)
        val edadJugador: TextView = itemView.findViewById(R.id.edadJugador)
    }
}
