# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "The Blis BLAS-like linear algebra library, as a self-contained C-extension."
HOMEPAGE = "https://github.com/explosion/cython-blis"
# NOTE: License in setup.py/PKGINFO is: BSD
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5772d61ce7a6ccc31730a9cd6849a091"

SRC_URI[sha256sum] = "1695a87e3fc4c20d9b9140f5238cac0514c411b750e8cdcec5d8320c71f62e99"

inherit pypi setuptools3

DEPENDS += " python3-cython-native python3-numpy-native python3-pip-native python3-numpy "

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "python-version-smaller-3-dot-9 python-version-bigger--equals-3-dot-9"

PACKAGECONFIG = "python-version-bigger--equals-3-dot-9"

PACKAGECONFIG[python-version-smaller-3-dot-9] = ",,,python3-numpy"
PACKAGECONFIG[python-version-bigger--equals-3-dot-9] = ",,,python3-numpy"


# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-misc python3-numpy"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    blis.cy
#    blis.py
#    hypothesis
#    hypothesis.extra.numpy
#    hypothesis.strategies

PYPI_PACKAGE = "blis"

