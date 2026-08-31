# Hailstone and Check Digit

**Unit 1 — Programming Fundamentals & Debugging** · Pairs with lecture 1.2 Day 1 (`while` loops, termination) and Day 2 (digit extraction, accumulator pattern)

Two classic loop problems, both written in the style of AP free-response
questions. **Hailstone**: start at any positive number, halve it if it is
even, triple-and-add-one if it is odd, and count how many steps it takes to
fall to 1 — nobody has ever found a starting number that does not get there,
and nobody has proved they all do. **Check digit**: the reason a mistyped
barcode gets rejected at the register. Every method here is a `while` or
`for` loop with a counter or an accumulator, and each method builds on the one
before it.

---

## Part 1 — Hailstone (`Hailstone.java`)

A **hailstone sequence** starts at a positive integer `n`. Each next term is
found by these rules:

- If `n` is 1, the sequence stops.
- If `n` is even, the next term is `n / 2`.
- If `n` is odd, the next term is `3n + 1`.

Example, starting at 5:

```
5  is odd   -> 5 * 3 + 1 = 16
16 is even  -> 16 / 2   = 8
8  is even  -> 8 / 2    = 4
4  is even  -> 4 / 2    = 2
2  is even  -> 2 / 2    = 1
1  -> stop
```

The sequence for 5 is `5, 16, 8, 4, 2, 1`. Its **length** is 6 — the number
of terms, counting the starting value and the final 1.

A sequence is **long** if its length is **greater than** its starting value.
5 has length 6, and 6 > 5, so 5 is long. 10 has length 7, and 7 is not > 10,
so 10 is not long.

## Part 2 — Check Digit (`CheckDigit.java`)

A **check digit** is one extra digit added to the end of a number so a typo
can be detected. To compute the check digit of a number with one to six
digits:

1. Multiply the first (leftmost) digit by 7, the second digit (if there is
   one) by 6, the third by 5, and so on — the multiplier goes down by one for
   each digit.
2. Add up the products.
3. The check digit is the **rightmost digit** of that sum.

Example, `num = 1732`:

```
1 x 7  +  7 x 6  +  3 x 5  +  2 x 4  =  7 + 42 + 15 + 8  =  72
```

The rightmost digit of 72 is 2, so `getCheck(1732)` returns `2`. The number
*with* its check digit attached is `17322`.

Two helper methods are **provided** and already work:

| Helper | Returns | Example |
|---|---|---|
| `getNumberOfDigits(num)` | how many digits `num` has | `getNumberOfDigits(1732)` → 4 |
| `getDigit(num, n)` | the *n*th digit of `num`, counting from the **left**, starting at 1 | `getDigit(1732, 1)` → 1, `getDigit(1732, 4)` → 2 |

---

## What you are given

| File | Status | Purpose |
|---|---|---|
| `src/main/java/Hailstone.java` | **you complete this** | `hailstoneLength`, `isLongSeq`, `propLong` |
| `src/main/java/CheckDigit.java` | **you complete this** | `getCheck`, `isValid`; `getNumberOfDigits` and `getDigit` are provided |
| `src/test/java/*Test.java` | provided | the autograder's tests — read them |
| `pom.xml`, `grading.json`, `.gitignore` | provided | build and grading setup — do not edit |

## What to write

All five methods are `public static` and already declared. Fill in the bodies.
Do not change the headers or the two provided helpers.

| Method | Points | What it does |
|---|---|---|
| `int hailstoneLength(int n)` | 25 | number of terms in the hailstone sequence starting at `n` |
| `boolean isLongSeq(int n)` | 10 | `true` if that length is strictly greater than `n` |
| `double propLong(int n)` | 25 | fraction of the starting values 1..`n` that are long |
| `int getCheck(int num)` | 25 | the check digit of `num` (1–6 digits) |
| `boolean isValid(int numWithCheckDigit)` | 15 | `true` if the last digit is the correct check digit for the digits before it |

### `hailstoneLength`

Precondition: `n > 0`. Start a counter at 1 (the starting value is a term).
While `n` is not 1: replace `n` with the next term and add one to the counter.
Return the counter.

- `hailstoneLength(5)` → 6
- `hailstoneLength(1)` → 1 (the sequence is just `[1]`)
- `hailstoneLength(27)` → 112 (it climbs past 9000 before it comes down)

**Trap:** starting the counter at 0, or testing `n > 1` with the update in
the wrong place, gives an answer that is off by one. Trace `n = 4` by hand:
`4, 2, 1` is three terms.

### `isLongSeq`

Precondition: `n > 0`. Return `hailstoneLength(n) > n`. One line.

- `isLongSeq(5)` → `true` (6 > 5)
- `isLongSeq(2)` → `false` (length 2 is not > 2)
- `isLongSeq(1)` → `false` (length 1 is not > 1)

**Trap:** `>=`. Equal is not "greater than".

### `propLong`

Precondition: `n > 0`. Count how many of the starting values `1, 2, …, n`
are long (call `isLongSeq`), then divide by `n`. Return a `double`.

- `propLong(10)` → `0.5` (3, 5, 6, 7, 9 are long — five of ten)
- `propLong(4)` → `0.25` (only 3 is long)
- `propLong(1)` → `0.0`

**Trap:** `count / n` with two `int`s is integer division — `4 / 7` is `0`.
Cast one side to `double` or divide by `(double) n`.

### `getCheck`

Precondition: `num >= 1` and has one to six digits. Loop `i` from 1 to
`getNumberOfDigits(num)`. Digit `i` (from the left) is `getDigit(num, i)`
and its multiplier is `8 - i` (so digit 1 × 7, digit 2 × 6, …). Add the
products into a sum. Return `sum % 10`.

- `getCheck(1732)` → 2
- `getCheck(9)` → 3 (9 × 7 = 63)
- `getCheck(999999)` → 3 (9 × (7+6+5+4+3+2) = 243)

**Trap:** returning the whole sum instead of its last digit, or counting
digits from the right. The **first** digit always gets the 7.

### `isValid`

Precondition: `numWithCheckDigit >= 10` and has two to seven digits. The
check digit is `numWithCheckDigit % 10`. The number in front of it is
`numWithCheckDigit / 10`. Return whether `getCheck` of the front part equals
the check digit.

- `isValid(17322)` → `true` (`getCheck(1732)` is 2)
- `isValid(17325)` → `false`
- `isValid(99)` → `false` (`getCheck(9)` is 3, not 9)

---

## Examples

| Call | Result | Trace |
|---|---|---|
| `hailstoneLength(3)` | 8 | 3, 10, 5, 16, 8, 4, 2, 1 |
| `isLongSeq(10)` | `false` | length 7, and 7 is not > 10 |
| `propLong(6)` | 0.5 | long: 3, 5, 6 → 3 of 6 |
| `getCheck(34)` | 5 | 3×7 + 4×6 = 45 → 5 |
| `isValid(346)` | `false` | `getCheck(34)` is 5, last digit is 6 |
| `isValid(6874257)` | `true` | `getCheck(687425)` = 157 → 7 |

---

## Running the tests

`mvn test` runs everything; `mvn test -Dtest=<ClassName>` runs one rubric line.

| Test class | Rubric line | Points |
|---|---|---|
| `HailstoneLengthTest` | Hailstone.hailstoneLength | 25 |
| `IsLongSeqTest` | Hailstone.isLongSeq | 10 |
| `PropLongTest` | Hailstone.propLong | 25 |
| `GetCheckTest` | CheckDigit.getCheck | 25 |
| `IsValidTest` | CheckDigit.isValid | 15 |

The autograder awards a rubric line only when every test in that class passes.

## Suggested order

1. **`hailstoneLength`** — the one real `while` loop in Part 1. Trace 4 and
   5 on paper first, then run `mvn test -Dtest=HailstoneLengthTest`. If the
   test for 27 hangs, your loop never reaches 1 — check the even/odd rule.
2. **`isLongSeq`** — one line. Check that 1 and 2 are `false`.
3. **`propLong`** — a `for` loop from 1 to `n` counting `isLongSeq` hits.
   If every answer is `0.0`, you have integer division.
4. **`getCheck`** — a `for` loop over digit positions with an accumulator.
   Print the running sum for 1732 and confirm you reach 72.
5. **`isValid`** — two integer operations and one call to `getCheck`.

## Rules of the road

- AP Java subset only: `while`, `for`, `if`/`else`, `%`, `/`, casting to
  `double`. No `String` conversion tricks for the digits (`Integer.toString`,
  `String.valueOf`) — use the provided `getDigit`. No `Math.log10`, no
  `var`, no streams.
- Do not change method headers or provided code (`getNumberOfDigits`,
  `getDigit`).
- Do not touch `src/test`, `pom.xml`, `grading.json`, or `.github`. The
  autograder checks that they are byte-identical to the template before it
  runs a single test; if they differ it stops and awards nothing, and the
  change shows up in the roster.
- `isLongSeq` must call `hailstoneLength`, and `isValid` must call
  `getCheck`. Re-implementing the logic inline is graded as a style problem
  even if the tests pass.
