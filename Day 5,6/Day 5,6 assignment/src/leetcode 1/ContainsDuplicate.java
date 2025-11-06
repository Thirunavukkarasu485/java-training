public static boolean containsDuplicate(int[] nums) {

    HashSet<Integer> set = new HashSet<>();


    for (int num : nums) {

        if (set.contains(num)) {
            return true;
        }

        set.add(num);
    }

    return false;
}


void main() {
    int[] nums = {1, 2, 3, 1};

    boolean result = containsDuplicate(nums);

    IO.println("Contains Duplicate: " + result);
}

