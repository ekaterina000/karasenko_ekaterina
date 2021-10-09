public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int i = 2;
        int sqrt = i * i;
        while(sqrt <= num) {
            i++;
            sqrt = i * i;
        }
        i--;
        sqrt = i * i;
        return sqrt;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int p = 1;
        int k = 1;
        while (k <= num)
        {
            p = 2 * p + 6;
            k++;
        }
        return p;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int base1 = base;
        while (base1  < num){
            base1  *= base;
        }
        if (base1  == num)
            return true;
        else
            return false;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int i = 0;
        while (start > end){
            if ((start % 2 == 0) && ((start/2) >= end))
            {
                start = start / 2;
            }
            else
                start -= 1;
            i++;
        }
        return i;
    }
}
