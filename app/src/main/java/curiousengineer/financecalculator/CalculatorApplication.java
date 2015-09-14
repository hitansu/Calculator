package curiousengineer.financecalculator;

import android.app.Application;

/**
 * Created by hp pc on 15-09-2015.
 */
public class CalculatorApplication extends Application{

    private static CalculatorApplication mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext= CalculatorApplication.this;
    }

    public CalculatorApplication getCalculatorAppContext() {
        return mAppContext;
    }
}
