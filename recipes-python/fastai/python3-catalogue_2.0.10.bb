# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Super lightweight function registries for your library"
HOMEPAGE = "https://github.com/explosion/catalogue"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1078676a9903ea0d111984467135785d"

SRC_URI[sha256sum] = "4f56daa940913d3f09d589c191c74e5a6d51762b3a9e37dd53b7437afd6cda15"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "python-version-smaller-3-dot-8"
PACKAGECONFIG[python-version-smaller-3-dot-8] = ",,,python3-typing-extensions python3-zipp"


# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-email python3-typing-extensions python3-zipp"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    pep517
#    pytest

PYPI_PACKAGE = "catalogue"
