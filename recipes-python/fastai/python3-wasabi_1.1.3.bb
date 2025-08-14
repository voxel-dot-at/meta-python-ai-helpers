# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A lightweight console printing and formatting toolkit"
HOMEPAGE = "https://github.com/explosion/wasabi"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=954273a2a93899ea889fcd05ba701314"

SRC_URI[sha256sum] = "4bb3008f003809db0c3e28b4daf20906ea871a2bb43f9914197d540f4f2e0878"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "python-version-smaller-3-dot-8 sys-platform-equals--equals-win32andpython-version-bigger--equals-3-dot-7"
PACKAGECONFIG[python-version-smaller-3-dot-8] = ",,,python3-typing_extensions"
PACKAGECONFIG[sys-platform-equals--equals-win32andpython-version-bigger--equals-3-dot-7] = ",,,python3-colorama"


# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-datetime python3-difflib python3-multiprocessing python3-typing-extensions"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    pytest

PYPI_PACKAGE = "wasabi"
