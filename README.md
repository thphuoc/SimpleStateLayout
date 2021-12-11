# SimpleStateLayout
[![IMAGE ALT TEXT HERE](/demo.gif)](/demo.gif)

Usage:
```xml
<com.thphuoc.ssl.SimpleStateLayout
        android:id="@+id/stateLayout"
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_height="match_parent"
        app:layout_app_error="@layout/view_error"
        app:layout_loading="@layout/view_loading"
        app:layout_init="@layout/view_init"
        app:layout_empty="@layout/view_empty"
        app:layout_content="@layout/view_content"
        app:layout_connection_error="@layout/view_connection_error"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

```kotlin
class MainActivity : AppCompatActivity() {

    private var currentState = SimpleStateLayout.State.INIT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stateLayout.showState(currentState)
        btnNext.setOnClickListener {
            val states = SimpleStateLayout.State.values()
            currentState = states[(currentState.ordinal + 1) % states.size]
            stateLayout.showState(currentState)
        }
    }
}
```