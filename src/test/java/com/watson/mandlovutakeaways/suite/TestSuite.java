package com.watson.mandlovutakeaways.suite;

import com.watson.mandlovutakeaways.domain.beverages.ColdBeveragesTest;
import com.watson.mandlovutakeaways.domain.beverages.HotBeveragesTest;
import com.watson.mandlovutakeaways.domain.beverages.MilkshakesTest;
import com.watson.mandlovutakeaways.domain.burgers.*;
import com.watson.mandlovutakeaways.domain.gatsbys.*;
import com.watson.mandlovutakeaways.domain.pizzas.*;

import org.junit.runners.Suite;

/**
 * Created by long on 2017-08-08
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(
    {
        //domain
        ColdBeveragesTest.class, HotBeveragesTest.class, MilkshakesTest.class,
        BeefBurgersTest.class, CheeseBurgerTest.class, RibBurgerTest.class, VeggyBurgerTest.class, ChickenBurgersTest.class,
        ChickenGatsbyTest.class, FullhouseGatsbyTest.class, PolonyGatsbyTest.class, SteakGatsbyTest.class,
        ChickenPizzaTest.class, HawaiianPizzaTest.class, MexicanPizzaTest.class, SteakPizzaTest.class
    }
)

public class TestSuite {
}
