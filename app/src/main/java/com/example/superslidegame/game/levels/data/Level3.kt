package com.example.superslidegame.game.levels.data

import com.example.superslidegame.game.elements.GamePiece
import com.example.superslidegame.game.elements.Orientation
import com.example.superslidegame.game.elements.PieceGroup
import com.example.superslidegame.game.elements.PieceType
import com.example.superslidegame.game.levels.Level

class Level3 : Level {

    private val piece1 = GamePiece(PieceType.YELLOW)
    private val piece2 = GamePiece(PieceType.YELLOW)
    private val piece3 = GamePiece(PieceType.RED, 3)
    private val piece4 = GamePiece(PieceType.RED, 3, 90F)
    private val piece5 = GamePiece(PieceType.YELLOW)
    private val piece6 = GamePiece(PieceType.EMPTY)
    private val piece7 = GamePiece(PieceType.RED, 3, 270F)
    private val piece8 = GamePiece(PieceType.RED, 3, 180F)
    private val piece9 = GamePiece(PieceType.YELLOW)
    private val piece10 = GamePiece(PieceType.YELLOW)
    private val piece11 = GamePiece(PieceType.YELLOW)
    private val piece12 = GamePiece(PieceType.BLUE, 1, 90F)
    private val piece13 = GamePiece(PieceType.YELLOW)
    private val piece14 = GamePiece(PieceType.YELLOW)
    private val piece15 = GamePiece(PieceType.YELLOW)
    private val piece16 = GamePiece(PieceType.BLUE, 1, 270F)
    private val piece17 = GamePiece(PieceType.YELLOW)
    private val piece18 = GamePiece(PieceType.EMPTY)
    private val piece19 = GamePiece(PieceType.YELLOW)
    private val piece20 = GamePiece(PieceType.YELLOW)

    private var pieces = mutableListOf(piece1, piece2, piece3, piece4, piece5, piece6, piece7, piece8, piece9, piece10, piece11, piece12, piece13, piece14, piece15, piece16, piece17, piece18, piece19, piece20)

    private var groups: MutableList<PieceGroup> = mutableListOf(
        PieceGroup(1, Orientation.VERTICAL, mutableListOf(piece12, piece16)),
        PieceGroup(3, mutableListOf(piece3, piece4, piece7, piece8))
    )

    override fun getNumber(): Int {
        return 1
    }

    override fun setPieces(pieces: MutableList<GamePiece>) {
        this.pieces = pieces
    }

    override fun getPieces(): MutableList<GamePiece> {
        return pieces
    }

    override fun getGroups(): MutableList<PieceGroup> {
        return groups
    }
}