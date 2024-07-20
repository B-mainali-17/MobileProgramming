public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        EditText address = findViewById(R.id.address);
        RadioGroup genderGroup = findViewById(R.id.genderGroup);
        EditText age = findViewById(R.id.age);
        DatePicker datePicker = findViewById(R.id.datePicker);
        Spinner stateSpinner = findViewById(R.id.stateSpinner);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String addr = address.getText().toString();
                int genderId = genderGroup.getCheckedRadioButtonId();
                String gender = ((RadioButton) findViewById(genderId)).getText().toString();
                String userAge = age.getText().toString();
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth();
                int year = datePicker.getYear();
                String dob = day + "/" + (month + 1) + "/" + year;
                String state = stateSpinner.getSelectedItem().toString();

                // Print data below the Submit button
                Log.d("UserData", "Username: " + user + "\nPassword: " + pass + "\nAddress: " + addr +
                        "\nGender: " + gender + "\nAge: " + userAge + "\nDOB: " + dob + "\nState: " + state);
            }
        });
    }
}
