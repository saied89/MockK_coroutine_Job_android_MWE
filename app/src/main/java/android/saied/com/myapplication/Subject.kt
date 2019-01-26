package android.saied.com.myapplication

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

open class Subject {
    private val job = Job()
    private val scope = CoroutineScope(Dispatchers.Main + job)

    open fun method() = scope.launch { Log.d("", "") }
}