package hcfCaculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HCFTest {
    @Test
    public void testThatFunctionCanTestHighestCommonFactorFprThreeNumbers() {
        int[] numbers = {12, 6, 36};
        int[] result = {2, 3};
        int[] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(result, answer);
    }

    @Test
    public void testThatFunctionCanTestForNumbersInHundred() {
        int [] numbers = {456,242,784};
        int [] result = {2};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(result,answer);
    }
    @Test
    public void testThatFunctionCanComputeHighestCommonFactorsWhenFactorsAreMoreThanTwo(){
        int [] numbers = {36,12,48};
        int [] result = {2,2,3};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(result,answer);
    }
    @Test
    public void testThatIfZeroIsIncludedInTheInPutOfNumbersFunctionWouldIgnoreTheZero(){
        int [] numbers = {25,0,50,125};
        int [] result = {5,5};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(answer,result);
    }
    @Test
    public void testThatFunctionCanReturnNothingWhenHighestCommonFactorIsNotFound(){
        int [] numbers = {56,7,15};
        int [] result = {};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(answer,result);
    }
    @Test
    public void testThatFunctionCanReturnHighestCommonFactorWhenThereIsNegativeNumber(){
        int [] numbers = {18,-6,30};
        int [] result = {2,3};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(answer,result);
    }
    @Test
    public void testThatFunctionCanReturnHighestCommonFactorForIfNumbersCombineDifferentType(){
        int [] numbers = {56,392,21560};
        int [] result = {2,2,2,7};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(answer,result);
    }
    @Test
    public void testThatFunctionCanReturnHighestCommonFactorWhenThereAreTwoThousandNumber(){
        int [] numbers = {8140,30,49728};
        int [] result = {2};
        int [] answer = HCF.highestCommonFactor(numbers);
        assertArrayEquals(answer,result);
    }
    @Test
    public void testThatWhenThereIsNoNumberInTheAvailable(){
        int [] number = new int[0];
        int [] result = {};
        int [] answer = HCF.highestCommonFactor(number);
        assertArrayEquals(answer,result);
    }
}




