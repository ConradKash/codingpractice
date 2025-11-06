# Algorithm Analysis Notations

## Big O Notation (O)
- Represents the **upper bound** or worst-case scenario
- Written as $O(f(n))$
- Example: If an algorithm is $O(n^2)$, it will never perform worse than quadratic time
- Formula: $f(n) \leq c \cdot g(n)$ for some positive constant $c$ and large enough $n$

## Theta Notation (Θ)
- Represents the **tight bound** (both upper and lower bounds)
- Written as $\Theta(f(n))$
- Means the algorithm grows exactly at that rate
- Formula: $c_1 \cdot g(n) \leq f(n) \leq c_2 \cdot g(n)$ for constants $c_1$, $c_2$

## Omega Notation (Ω)
- Represents the **lower bound** or best-case scenario
- Written as $\Omega(f(n))$
- Example: If an algorithm is $\Omega(n)$, it will never perform better than linear time
- Formula: $f(n) \geq c \cdot g(n)$ for some positive constant $c$ and large enough $n$

## Common Time Complexities (from fastest to slowest):
1. $O(1)$ - Constant time
2. $O(\log n)$ - Logarithmic time
3. $O(n)$ - Linear time
4. $O(n \log n)$ - Linearithmic time
5. $O(n^2)$ - Quadratic time
6. $O(2^n)$ - Exponential time
7. $O(n!)$ - Factorial time

Here's a practical example in Python:

````python
# O(1) - Constant time
def get_first_element(arr):
    return arr[0]

# O(n) - Linear time
def find_element(arr, target):
    for element in arr:
        if element == target:
            return True
    return False

# O(n²) - Quadratic time
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr
````

Remember:
- Big O is most commonly used because we often want to know the worst-case scenario
- The actual running time depends on hardware, but these notations help us compare algorithms independently of implementation details
- When analyzing algorithms, we focus on the dominant term and drop constants
  - Example: $O(2n^2 + 3n + 1)$ simplifies to $O(n^2)$