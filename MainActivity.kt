package com.example.iiisss1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import com.example.iiisss1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


//체크했을 때 체크박스를 문자열에 저장하기 위한 함수 생성

    fun Food(array1:String) {
        val food:String
        food=array1
    }
    fun Hobby(array2:String) {
        val hobby:String
        hobby=array2
    }
    fun Place(array3:String) {
        val place:String
        place=array3
    }

    //체크박스 눌렀을 때 위의 함수들 실행하기

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val listener by lazy { CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        when (buttonView.id){
            R.id.checkHansik->Food("한식")
            R.id.checkYangsik->Food("양식")
            R.id.checkJunsik->Food("중식")
            R.id.checkIlsik->Food("일식")
            R.id.checkAsian->Food("아시아음식")
            R.id.checkDessert->Food("디저트")
            R.id.checkDrink->Food("술")
            R.id.checkVeg->Food("비건")
            R.id.checkWorkout->Hobby("헬스")
            R.id.checkReading->Hobby("독서")
            R.id.checkMusic->Hobby("음악")
            R.id.checkMovie->Hobby("영화")
            R.id.checkSwimming->Hobby("수영")
            R.id.checkBicycle->Hobby("자전거")
            R.id.checkTennis->Hobby("테니스")
            R.id.checkSoccer->Hobby("축구")
            R.id.checkMedi->Hobby("명상")
            R.id.checkStudy->Hobby("공부")
            R.id.checkPicture->Hobby("사진")
            R.id.checkGolf->Hobby("골프")
            R.id.checkKorea->Place("한국")
            R.id.checkBri->Place("영국")
            R.id.checkFra->Place("프랑스")
            R.id.checkChi->Place("중국")
            R.id.checkJap->Place("일본")
            R.id.checkAmer->Place("미국")
            R.id.checkAust->Place("호주")
            R.id.checkHonk->Place("홍콩")
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //화면 넘기기
        val intent=Intent(this, SubActivity::class.java)
        val intent2=Intent(this, LastActivity::class.java)

        binding.complete.setOnClickListener{startActivity(intent)}
        binding.backspace.setOnClickListener{LastActivity(intent2)}

        //체크박스
        binding.checkHansik.setOnCheckedChangeListener(listener)
        binding.checkYangsik.setOnCheckedChangeListener(listener)
        binding.checkJunsik.setOnCheckedChangeListener(listener)
        binding.checkIlsik.setOnCheckedChangeListener(listener)
        binding.checkAsian.setOnCheckedChangeListener(listener)
        binding.checkDessert.setOnCheckedChangeListener(listener)
        binding.checkDrink.setOnCheckedChangeListener(listener)
        binding.checkVeg.setOnCheckedChangeListener(listener)
        binding.checkWorkout.setOnCheckedChangeListener(listener)
        binding.checkReading.setOnCheckedChangeListener(listener)
        binding.checkMusic.setOnCheckedChangeListener(listener)
        binding.checkMovie.setOnCheckedChangeListener(listener)
        binding.checkSwimming.setOnCheckedChangeListener(listener)
        binding.checkBicycle.setOnCheckedChangeListener(listener)
        binding.checkTennis.setOnCheckedChangeListener(listener)
        binding.checkSoccer.setOnCheckedChangeListener(listener)
        binding.checkMedi.setOnCheckedChangeListener(listener)
        binding.checkStudy.setOnCheckedChangeListener(listener)
        binding.checkPicture.setOnCheckedChangeListener(listener)
        binding.checkGolf.setOnCheckedChangeListener(listener)
        binding.checkKorea.setOnCheckedChangeListener(listener)
        binding.checkBri.setOnCheckedChangeListener(listener)
        binding.checkFra.setOnCheckedChangeListener(listener)
        binding.checkChi.setOnCheckedChangeListener(listener)
        binding.checkJap.setOnCheckedChangeListener(listener)
        binding.checkAmer.setOnCheckedChangeListener(listener)
        binding.checkAust.setOnCheckedChangeListener(listener)
        binding.checkHonk.setOnCheckedChangeListener(listener)




    }
}