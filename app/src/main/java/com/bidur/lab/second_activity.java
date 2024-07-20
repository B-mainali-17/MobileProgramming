public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView displayText = findViewById(R.id.displayText);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text_key");
        displayText.setText(text);
    }
}
