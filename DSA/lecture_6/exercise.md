# Recurrence Relation Analysis: Mystery Algorithm

## Problem Analysis

Let's analyze the given recursive algorithm:
```python
def mystery(n):
    if n <= 1:
        return 1
    else:
        return mystery(n-1) + mystery(n-1)
```

## Recurrence Relation

The recurrence relation for the running time T(n) is:
- T(n) = 2T(n-1) + O(1), where n > 1
- T(1) = O(1)

## Solving the Recurrence

1. Let's expand this:
   - T(n) = 2T(n-1) + c
   - T(n) = 2[2T(n-2) + c] + c = 2²T(n-2) + 2c + c
   - T(n) = 2²[2T(n-3) + c] + 2c + c = 2³T(n-3) + 2²c + 2c + c

2. Pattern:
   - After k steps: T(n) = 2ᵏT(n-k) + (2ᵏ⁻¹ + 2ᵏ⁻² + ... + 2 + 1)c

3. When n-k = 1:
   - k = n-1
   - T(n) = 2ⁿ⁻¹ + (2ⁿ⁻¹ - 1)c
   
Therefore, T(n) = O(2ⁿ)

## Comparison with Fibonacci

The naive Fibonacci recursive algorithm has complexity O(1.618ⁿ).
- Mystery algorithm: O(2ⁿ) ≈ 2ⁿ
- Fibonacci recursive: O(φⁿ) ≈ 1.618ⁿ

The Fibonacci recursive algorithm is faster because:
1. 2ⁿ grows faster than 1.618ⁿ
2. Mystery makes two identical recursive calls, while Fibonacci makes two different calls, allowing for potential reuse of calculations
