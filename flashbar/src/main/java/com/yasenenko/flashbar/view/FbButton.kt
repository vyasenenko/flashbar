package com.yasenenko.flashbar.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.AutoCompleteTextView
import com.yasenenko.flashbar.R

@SuppressLint("AppCompatCustomView")
internal class FbButton : AutoCompleteTextView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs, R.style.FbButtonStyle)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}