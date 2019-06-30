package com.example.youssef.ar_foods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class fooddetail extends AppCompatActivity {

    TextView way,ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);

        way=findViewById(R.id.theway);
        ingredients=findViewById(R.id.ingred);

        Intent intent=getIntent();
        int i=intent.getIntExtra("content",0);
        switch (i)
        {
            case 11:{
                way.setText(getResources().getString(R.string.alexsusagway));
                ingredients.setText(getResources().getString(R.string.alexsusageintegr));
                break;
            }
            case 12:{
                way.setText(getResources().getString(R.string.beanwitheggway));
                ingredients.setText(getResources().getString(R.string.beanwithegginteg));
                break;
            }
            case 13:{
                way.setText(getResources().getString(R.string.chickenrollway));
                ingredients.setText(getResources().getString(R.string.chickenrollinteg));
                break;
            }
            case 14: {
                way.setText(getResources().getString(R.string.molokhiway));
                ingredients.setText(getResources().getString(R.string.molokhiinteg));
                break;
            }
            case 15:{
                way.setText(getResources().getString(R.string.koshriway));
                ingredients.setText(getResources().getString(R.string.koshriinteg));
                break;
            }
            case 16:{
                way.setText(getResources().getString(R.string.kosabashamelway));
                ingredients.setText(getResources().getString(R.string.kosabashamelinteg));
                break;
            }
            case 17:{
                way.setText(getResources().getString(R.string.torlimeatway));
                ingredients.setText(getResources().getString(R.string.torlimeatinteg));
                break;
            }
            case 18:{
                way.setText(getResources().getString(R.string.gmbrehameway));
                ingredients.setText(getResources().getString(R.string.gmbrehameinteg));
                break;
            }
            case 19:{
                way.setText(getResources().getString(R.string.besaraway));
                ingredients.setText(getResources().getString(R.string.bsarainteg));
                break;
            }
            case 110:{
                way.setText(getResources().getString(R.string.negrscoway));
                ingredients.setText(getResources().getString(R.string.negrscointeg));
                break;
            }
            case 111:{
                way.setText(getResources().getString(R.string.chickenballway));
                ingredients.setText(getResources().getString(R.string.chickenballinteg));
                break;
            }
            case 112:{
                way.setText(getResources().getString(R.string.kosabashamelway));
                ingredients.setText(getResources().getString(R.string.kosabashamelinteg));
                break;
            }
            case 21:{
                way.setText(getResources().getString(R.string.babaganougway));
                ingredients.setText(getResources().getString(R.string.babaganoginteg));
                break;
            }
            case 22:{
                way.setText(getResources().getString(R.string.floursaladway));
                ingredients.setText(getResources().getString(R.string.floursaladinteg));
                break;
            }
            case 23:{
                way.setText(getResources().getString(R.string.potatosaladway));
                ingredients.setText(getResources().getString(R.string.potatosaladinteg));
                break;
            }
            case 24:{
                way.setText(getResources().getString(R.string.homussaladway));
                ingredients.setText(getResources().getString(R.string.hmoussaladinteg));
                break;
            }
            case 25:{
                way.setText(getResources().getString(R.string.coolsloway));
                ingredients.setText(getResources().getString(R.string.collslosaladinteg));
                break;
            }
            case 26:{
                way.setText(getResources().getString(R.string.taboulasaladway));
                ingredients.setText(getResources().getString(R.string.taboulasaladinteg));
                break;
            }
            case 27:{
                way.setText(getResources().getString(R.string.piesaladway));
                ingredients.setText(getResources().getString(R.string.piesaladinteg));
                break;
            }
            case 28:{
                way.setText(getResources().getString(R.string.sezarsaladway));
                ingredients.setText(getResources().getString(R.string.sezarsaladinteg));
                break;
            }
            case 29:{
                way.setText(getResources().getString(R.string.homussaladway));
                ingredients.setText(getResources().getString(R.string.hmoussaladinteg));
                break;
            }
            case 210:{
                way.setText(getResources().getString(R.string.egglphantway));
                ingredients.setText(getResources().getString(R.string.egglphantinteg));
                break;
            }
            case 211:{
                way.setText(getResources().getString(R.string.watercressway));
                ingredients.setText(getResources().getString(R.string.watercressinteg));
                break;
            }
            case 212:{
                way.setText(getResources().getString(R.string.pastatunaway));
                ingredients.setText(getResources().getString(R.string.pastatunainteg));
                break;
            }
            case 213:{
                way.setText(getResources().getString(R.string.tunabtatsway));
                ingredients.setText(getResources().getString(R.string.tunabtatasinteg));
                break;
            }
            case 31:{
                way.setText(getResources().getString(R.string.greenonionsoupway));
                ingredients.setText(getResources().getString(R.string.greenoninonsoupinte));
                break;
            }
            case 32:{
                way.setText(getResources().getString(R.string.shofansoupway));
                ingredients.setText(getResources().getString(R.string.shofansoupinteg));
                break;
            }
            case 33:{
                way.setText(getResources().getString(R.string.ryhansoupway));
                ingredients.setText(getResources().getString(R.string.ryhansoupinteg));
                break;
            }
            case 34:{
                way.setText(getResources().getString(R.string.lsanasforway));
                ingredients.setText(getResources().getString(R.string.lsanasforinteg));
                break;
            }
            case 35:{
                way.setText(getResources().getString(R.string.garlicsoupway));
                ingredients.setText(getResources().getString(R.string.GarlicSoupinteg));
                break;
            }
            case 36:{
                way.setText(getResources().getString(R.string.essixway));
                ingredients.setText(getResources().getString(R.string.essixinteg));
                break;
            }
            case 41:{
                way.setText(getResources().getString(R.string.basbosaeshtaway));
                ingredients.setText(getResources().getString(R.string.basbousaeshtainteg));
                break;
            }
            case 42:{
                way.setText(getResources().getString(R.string.ricemilkway));
                ingredients.setText(getResources().getString(R.string.ricemilkinteg));
                break;
            }
            case 43:{
                way.setText(getResources().getString(R.string.blozaway));
                ingredients.setText(getResources().getString(R.string.blozamhlbeainteg));
                break;
            }
            case 44:{
                way.setText(getResources().getString(R.string.edfourway));
                ingredients.setText(getResources().getString(R.string.edfourinteg));
                break;
            }
            case 911:{
                way.setText(getResources().getString(R.string.kbsaway));
                ingredients.setText(getResources().getString(R.string.kbsal7mainteg));
                break;
            }
            case 912:{
                way.setText(getResources().getString(R.string.yellowriceway));
                ingredients.setText(getResources().getString(R.string.yellowriceinteg));
                break;
            }
            case 913:{
                way.setText(getResources().getString(R.string.hotsalsaway));
                ingredients.setText(getResources().getString(R.string.hotsalsainteg));
                break;
            }
            case 914:{
                way.setText(getResources().getString(R.string.mandychicway));
                ingredients.setText(getResources().getString(R.string.mandychiinteg));
                break;
            }
            case 915:{
                way.setText(getResources().getString(R.string.tandorchickenway));
                ingredients.setText(getResources().getString(R.string.tandorichickeninteg));
                break;
            }
            case 916:{
                way.setText(getResources().getString(R.string.shaksokaway));
                ingredients.setText(getResources().getString(R.string.shakshokainteg));
                break;
            }
            case 941:{
                way.setText(getResources().getString(R.string.gdoneway));
                ingredients.setText(getResources().getString(R.string.gdoneinte));
                break;
            }
            case 942:{
                way.setText(getResources().getString(R.string.gdtwoway));
                ingredients.setText(getResources().getString(R.string.gdtwointeg));
                break;
            }
            case 943:{
                way.setText(getResources().getString(R.string.gdthreeway));
                ingredients.setText(getResources().getString(R.string.gdthreeinteg));
                break;
            }
            case 944:{
                way.setText(getResources().getString(R.string.gdfourway));
                ingredients.setText(getResources().getString(R.string.gdfourinteg));
                break;
            }
            case 945:{
                way.setText(getResources().getString(R.string.gdfiveway));
                ingredients.setText(getResources().getString(R.string.gdfiveinteg));
                break;
            }
            case 946:{
                way.setText(getResources().getString(R.string.gdsixway));
                ingredients.setText(getResources().getString(R.string.gdsixinteg));
                break;
            }
            case 947:{
                way.setText(getResources().getString(R.string.gdsevenway));
                ingredients.setText(getResources().getString(R.string.gdseveninteg));
                break;
            }
            case 101:{
                way.setText(getResources().getString(R.string.romansaladway));
                ingredients.setText(getResources().getString(R.string.romansaladinteg));
                break;
            }
            case 102:{
                way.setText(getResources().getString(R.string.flowersaladway));
                ingredients.setText(getResources().getString(R.string.flowersaladinteg));
                break;
            }
            case 103:{
                way.setText(getResources().getString(R.string.goatsaladway));
                ingredients.setText(getResources().getString(R.string.goatsaladinteg));
                break;
            }
            case 104:{
                way.setText(getResources().getString(R.string.ftoshway));
                ingredients.setText(getResources().getString(R.string.ftoshinteg));
                break;
            }
            case 105:{
                way.setText(getResources().getString(R.string.msasatway));
                ingredients.setText(getResources().getString(R.string.msasatinteg));
                break;
            }
            case 106:{
                way.setText(getResources().getString(R.string.shamndrway));
                ingredients.setText(getResources().getString(R.string.shamndrinteg));
                break;
            }
            case 931:{
                way.setText(getResources().getString(R.string.khrshofmilksoupway));
                ingredients.setText(getResources().getString(R.string.khrshofmilksoupinteg));
                break;
            }

            case 932:{
                way.setText(getResources().getString(R.string.khodartmrway));
                ingredients.setText(getResources().getString(R.string.khodartmrinteg));
                break;
            }

            case 933:{
                way.setText(getResources().getString(R.string.ftrcreamyway));
                ingredients.setText(getResources().getString(R.string.ftrcreamyinteg));
                break;
            }

            case 934:{
                way.setText(getResources().getString(R.string.sbanlsan5way));
                ingredients.setText(getResources().getString(R.string.sbn5lsaninteg));
                break;
            }

            case 935:{
                way.setText(getResources().getString(R.string.ryhansoupsaudiway));
                ingredients.setText(getResources().getString(R.string.ryhansoupsauidainteg));
                break;
            }

            case 511:{
                way.setText(getResources().getString(R.string.shawrmabreadway));
                ingredients.setText(getResources().getString(R.string.Shawarmabreadinteg));
                break;
            }
            case 512:{
                way.setText(getResources().getString(R.string.kuftahalabiway));
                ingredients.setText(getResources().getString(R.string.KuftaHalabiinteg));
                break;
            }
            case 513:{
                way.setText(getResources().getString(R.string.perfectmkdosway));
                ingredients.setText(getResources().getString(R.string.perfectmkdosinteg));
                break;
            }
            case 514:{
                way.setText(getResources().getString(R.string.burnfingerway));
                ingredients.setText(getResources().getString(R.string.Burnfingerinteg));
                break;
            }
            case 515:{
                way.setText(getResources().getString(R.string.mainchickenshawrmamainway));
                ingredients.setText(getResources().getString(R.string.mainchickenshawrmainteg));
                break;
            }
            case 516:{
                way.setText(getResources().getString(R.string.egablbnaway));
                ingredients.setText(getResources().getString(R.string.egablbnainteg));
                break;
            }
            case 517:{
                way.setText(getResources().getString(R.string.egablbnaway));
                ingredients.setText(getResources().getString(R.string.egablbnainteg));
                break;
            }
            case 518:{
                way.setText(getResources().getString(R.string.egablbnaway));
                ingredients.setText(getResources().getString(R.string.egablbnainteg));
                break;
            }
            case 519:{
                way.setText(getResources().getString(R.string.seneadgagway));
                ingredients.setText(getResources().getString(R.string.seneadgaginteg));
                break;
            }
            case 521:{
                way.setText(getResources().getString(R.string.taboulakenonasaldway));
                ingredients.setText(getResources().getString(R.string.taboulakenonasaladinteg));
                break;
            }
            case 522:{
                way.setText(getResources().getString(R.string.tmatmzetway));
                ingredients.setText(getResources().getString(R.string.tmatmbzetinteg));
                break;
            }
            case 523:{
                way.setText(getResources().getString(R.string.kratelbnaway));
                ingredients.setText(getResources().getString(R.string.kratelbnanteg));
                break;
            }
            case 524:{
                way.setText(getResources().getString(R.string.foulb2donsway));
                ingredients.setText(getResources().getString(R.string.foulb2donsinteg));
                break;
            }
            case 525:{
                way.setText(getResources().getString(R.string.btatazbadyway));
                ingredients.setText(getResources().getString(R.string.btatazbadyinteg));
                break;
            }
            case 526:{
                    way.setText(getResources().getString(R.string.shamndrlbnsaladaway));
                    ingredients.setText(getResources().getString(R.string.shamndrlbnasaladinteg));
                    break;
            }
            case 527:{
                way.setText(getResources().getString(R.string.btatalbnasaladway));
                ingredients.setText(getResources().getString(R.string.btatalbnasaladinteg));
                break;
            }
            case 531:{
                way.setText(getResources().getString(R.string.ssoneway));
                ingredients.setText(getResources().getString(R.string.ssoneinteg));
                break;
            }
            case 532:{
                way.setText(getResources().getString(R.string.sstwoway));
                ingredients.setText(getResources().getString(R.string.sstwointeg));
                break;
            }
            case 533:{
                way.setText(getResources().getString(R.string.ssthreeway));
                ingredients.setText(getResources().getString(R.string.ssthreeinteg));
                break;
            }
            case 534:{
                way.setText(getResources().getString(R.string.ssfourway));
                ingredients.setText(getResources().getString(R.string.ssfourinteg));
                break;
            }
            case 535:{
                way.setText(getResources().getString(R.string.ssfiveway));
                ingredients.setText(getResources().getString(R.string.ssfiveinteg));
                break;
            }
            case 536:{
                way.setText(getResources().getString(R.string.sssixway));
                ingredients.setText(getResources().getString(R.string.sssixinteg));
                break;
            }
            case 537:{
                way.setText(getResources().getString(R.string.sssevenway));
                ingredients.setText(getResources().getString(R.string.ssseveninteg));
                break;
            }
            case 541:{
                way.setText(getResources().getString(R.string.sdoneway));
                ingredients.setText(getResources().getString(R.string.sdoneinteg));
                break;
            }
            case 542:{
                way.setText(getResources().getString(R.string.sdtwoway));
                ingredients.setText(getResources().getString(R.string.sdtwointeg));
                break;
            }
            case 543:{
                way.setText(getResources().getString(R.string.sdthreeway));
                ingredients.setText(getResources().getString(R.string.sdthreeinteg));
                break;
            }
            case 544:{
                way.setText(getResources().getString(R.string.sdfourway));
                ingredients.setText(getResources().getString(R.string.sdfourinteg));
                break;
            }
            case 545:{
                way.setText(getResources().getString(R.string.sdfiveway));
                ingredients.setText(getResources().getString(R.string.sdfiveinteg));
                break;
            }
            case 546:{
                way.setText(getResources().getString(R.string.sdsixway));
                ingredients.setText(getResources().getString(R.string.sdsixinteg));
                break;
            }
            case 547:{
                way.setText(getResources().getString(R.string.sdsevenway));
                ingredients.setText(getResources().getString(R.string.sdseveninteg));
                break;
            }









        }

    }
}
