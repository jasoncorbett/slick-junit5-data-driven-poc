# Slick reporting for junit 5 data driven

What I am trying to do is figure out how we can support standard
junit5 jupiter data driven (ParameterizedTest) but allow for
slick reporting, and scheduling / running individual parameterized
instances.

The approach I am currently taking is to copy (subclass wasn't an
option) the needed non-public classes from junit and build
a slightly customized ParameterizedTest extension.  The custom one
will work the same when normally running the test, but act differently
when parameters or properties are supplied that specify which one of
the instances were supposed to be re-run.  This is what slick would
need to do in order to run only one instance of a parameterized test.

This has to be able to be a runtime option.  Luckily in it's final form
we can keep the annotation name ParameterizedTest, and the test will just
need to change the package import for the annotation.
