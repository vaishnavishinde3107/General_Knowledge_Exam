package com.example.dailoguebox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dailoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//      Question 1
        binding.question1.setOnClickListener {
            //question 1 options
            val options = arrayOf("a) Charles Dickens", "b) William Shakespeare", "c) Jane Austen")
            val ques1 = AlertDialog.Builder(this)
            ques1.setTitle("Who wrote the play Romeo and Juliet?")
            ques1.setIcon(R.drawable.baseline_arrow_right_24)
            ques1.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this, "Answer selected", Toast.LENGTH_SHORT).show()
                })
            ques1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "Answer collected", Toast.LENGTH_SHORT).show()
            })
            ques1.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "No answer selected", Toast.LENGTH_SHORT).show()
            })
            ques1.show()

            binding.question2.setOnClickListener {
                val options2 = arrayOf("a) Sydney", "b) Melbourne", "c) Canberra")
                val ques2 = AlertDialog.Builder(this)
                ques2.setTitle("2. Question: What is the capital city of Australia?")
                ques1.setIcon(R.drawable.baseline_arrow_right_24)
                ques2.setSingleChoiceItems(options2, 0, DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "Answer selected", Toast.LENGTH_SHORT).show()
                    })
                ques2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this, "Answer collected", Toast.LENGTH_SHORT).show()
                })
                ques2.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this, "No answer selected", Toast.LENGTH_SHORT).show()
                })
                ques2.show()

                binding.question3.setOnClickListener {
                    val options3 = arrayOf("a) Venus", "b) Mars", "c) Jupiter")
                    val ques3 = AlertDialog.Builder(this)
                    ques3.setTitle("4. Question: Which planet is known as the Red Planet?")
                    ques1.setIcon(R.drawable.baseline_arrow_right_24)
                    ques3.setSingleChoiceItems(options3, 0, DialogInterface.OnClickListener { dialog, which ->
                            Toast.makeText(this, "Answer selected", Toast.LENGTH_SHORT).show()
                        })
                    ques3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                            Toast.makeText(this, "Answer collected", Toast.LENGTH_SHORT).show()
                        })
                    ques3.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                            Toast.makeText(this, "No answer selected", Toast.LENGTH_SHORT).show()
                        })
                    ques3.show()
                }


                binding.question4.setOnClickListener {
                    val options4 = arrayOf("a) China","b) Japan","c) South Korea")
                    val ques4 = AlertDialog.Builder(this)
                    ques4.setTitle("4. Question: Which country is known as the Land of the Rising Sun?")
                    ques1.setIcon(R.drawable.baseline_arrow_right_24)
                    ques4.setSingleChoiceItems(options4,0,DialogInterface.OnClickListener{ dialog, which ->
                        Toast.makeText(this, "Answer selected", Toast.LENGTH_SHORT).show()
                    })
                    ques4.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialog, which ->
                        Toast.makeText(this, "Answer collected", Toast.LENGTH_SHORT).show()
                    })
                    ques4.setNegativeButton("Cancel",DialogInterface.OnClickListener{ dialog, which ->
                        Toast.makeText(this, "No answer selected", Toast.LENGTH_SHORT).show()
                    })
                    ques4.show()
                }

                binding.question5.setOnClickListener {
                    val options5 = arrayOf("a) Vincent van Gogh", "b) Leonardo da Vinci", "c) Pablo Picasso")
                    val ques5 = AlertDialog.Builder(this)
                    ques5.setTitle("5. Question: Who painted the Mona Lisa?")
                    ques1.setIcon(R.drawable.baseline_arrow_right_24)
                    ques5.setSingleChoiceItems(options5, 0, DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "Answer selected", Toast.LENGTH_SHORT).show()
                    })
                    ques5.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "Answer collected", Toast.LENGTH_SHORT).show()
                    })
                    ques5.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                            Toast.makeText(this, "No answer selected", Toast.LENGTH_SHORT).show()
                        })
                    ques5.show()
                }

                //button dialogue box
                binding.submitBtn.setOnClickListener {
                    val submit = AlertDialog.Builder(this)
                    submit.setTitle("Are you sure?")
                    submit.setIcon(R.drawable.baseline_arrow_right_24)
                    submit.setMessage("Do you want to submit?")
                    submit.setPositiveButton("Yes", DialogInterface.OnClickListener{ dialog, which ->
                        Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
                        finish()
                    })
                    submit.setNegativeButton("No", DialogInterface.OnClickListener{ dialog, which ->
                        Toast.makeText(this, "Not submitted", Toast.LENGTH_SHORT).show()
                    })
                    submit.show()
                }
            }
        }
    }
}



