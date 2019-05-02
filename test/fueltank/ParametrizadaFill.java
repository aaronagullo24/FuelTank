/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueltank;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Aaron
 */
@RunWith(Parameterized.class)
public class ParametrizadaFill{

    FuelTank tank = new FuelTank(60, 10);

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{10, 20}, {15, 35}, {20, 30}, {35, 45}});
    }

    private int relleno;
    private int esperado;

    public ParametrizadaFill(int relleno, int esperado) {
        this.relleno = relleno;
        this.esperado = esperado;
    }

    @Test
    public void fill() {
        tank.fill(relleno);
        double nivel = tank.getTankLevel();
        Assert.assertEquals(esperado, nivel, 0.0);
    }
}