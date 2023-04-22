package com.example.superslidegame.game.elements

import android.app.Activity
import android.content.Context
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.superslidegame.R
import com.example.superslidegame.game.levels.Level

class ImageAdapter(private val screenActivity: Activity, level: Level) : BaseAdapter() {

    private val pieces: MutableList<GamePiece> = level.getPieces()

    private val groups: MutableList<PieceGroup> = level.getGroups()

    private val context : Context = screenActivity.baseContext

    override fun getCount(): Int {
        return pieces.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: android.view.View?, parent: android.view.ViewGroup?): android.view.View {
        val imageButton = ImageButton(context)
        imageButton.setImageResource(pieces[position].imgSrc)
        imageButton.setBackgroundColor(ContextCompat.getColor(context, R.color.transparent))
        imageButton.scaleType = ImageView.ScaleType.FIT_CENTER
        imageButton.adjustViewBounds = true
        imageButton.setPadding(0, 0, 0, 0)
        imageButton.setOnClickListener(ClickListener(context, position, this))
        return imageButton
    }

    fun getPiecesState() : MutableList<GamePiece> {
        return pieces
    }

    fun getPositionOfPiece(piece: GamePiece) : Int {
        for (i in pieces.indices) {
            if (pieces[i] == piece) {
                return i
            }
        }
        throw Exception("Piece not found")
    }

    fun getGroup(groupId: Int) : PieceGroup {
        for (group in groups) {
            if (group.id == groupId) {
                return group
            }
        }
        throw Exception("Group not found")
    }

    fun swapPositions(fromPosition: Int, toPosition: Int) {
        // Swap the positions of the pieces list
        val temp = pieces[fromPosition]
        pieces[fromPosition] = pieces[toPosition]
        pieces[toPosition] = temp
    }
    fun updateBoard() {
        screenActivity.runOnUiThread {
            notifyDataSetChanged()
        }
    }
}