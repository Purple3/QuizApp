package com.purple3.quizapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_quiz_main.*


class QuizMainActivity : AppCompatActivity() {

    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    private var quizTopics : Array<String> = arrayOf("Politics", "GK", "Current Affairs")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_main)

        viewAdapter = RecyclerViewAdapter(quizTopics)
        //viewManager = GridLayoutManager(this,quizTopics.size)
        viewManager = LinearLayoutManager(this)

        rv_listOfTopics.apply {
            setHasFixedSize(true)
            adapter = viewAdapter
            layoutManager = viewManager
        }

    }

}
