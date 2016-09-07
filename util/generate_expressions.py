#!/usr/bin/python
# This is just the very beginning of a script that can be used to process
# arithmetic expressions.  At the moment it just defines a few classes
# and prints a couple example expressions.

# Possible additions include methods to evaluate expressions and generate
# some random expressions.
# Stolen from: http://stackoverflow.com/questions/6881170/is-there-a-way-to-autogenerate-valid-arithmetic-expressions
from random import random, randint, choice, seed
import sys

class Expression:
    pass

class Number(Expression):
    def __init__(self, num):
        self.num = num

    def __str__(self):
        return str(self.num)

class BinaryExpression(Expression):
    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def __str__(self):
        return str(self.left) + " " + self.op + " "  + str(self.right)

class ParenthesizedExpression(Expression):
    def __init__(self, exp):
        self.exp = exp

    def __str__(self):
        return "( " + str(self.exp) + " )"

def randomExpression(prob):
    p = random()
    if p > prob:
        return Number(randint(1, 100))
    elif randint(0, 1) == 0:
        return ParenthesizedExpression(randomExpression(prob / 1.2))
    else:
        left = randomExpression(prob / 1.2)
        op = choice(["+", "-", "*", "/"])
        right = randomExpression(prob / 1.2)
        return BinaryExpression(left, op, right)

if __name__ == "__main__":
    ITERATIONS = 10
    if len(sys.argv) > 1:
        ITERATIONS = int(sys.argv[1])
    if len(sys.argv) > 2:
        seed(sys.argv[2])

    for i in range(ITERATIONS):
        print(randomExpression(1))
