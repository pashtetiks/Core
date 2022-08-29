package task2

class ArraySorterTest extends GroovyTestCase {

    def arraySorter = new ArraySorter()

    void testSortWithDuplication() {
        setup:
        int[] arr = [5, 3, 9, 2, 5]
        int[] sortedArray = [2, 3, 5, 5, 9]
        when:
        def result = arraySorter.sort(arr)
        then:
        for(int i = 0; i < result.length; i++){
            result[i] == sortedArray[i];
        }
    }
}
