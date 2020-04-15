package am.food.teymortak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_puzzle.*


class TeymorFragment : Fragment() {



        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? =// Inflate the layout for this fragment
            inflater.inflate(R.layout.fragment_puzzle, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val  mainActivity:MainActivity=activity as MainActivity
        val puzzleBoardView=TeymorBoardView(context!!,mainActivity.n)
        puzzle_container.addView(puzzleBoardView)
        button_new_game.setOnClickListener {
            puzzleBoardView.initGame()
            puzzleBoardView.invalidate()
        }
    }
}