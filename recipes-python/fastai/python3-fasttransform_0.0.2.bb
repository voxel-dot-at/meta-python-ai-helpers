# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Transform is the main building block of data pipelines in fastai. And elsewhere if you want."
HOMEPAGE = "https://github.com/AnswerDotAI/fasttransform"
# NOTE: License in setup.py/PKGINFO is: Apache Software License 2.0
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
# NOTE: Original package / source metadata indicates license is: Apache
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "18ea6964128be779a1c483d4775f1b5a2e452f915c2d30dfa2d91adca98453d7"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "dev"
PACKAGECONFIG[dev] = ",,,python3-matplotlib python3-numpy python3-pandas"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-fastcore python3-plum-dispatch"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-numpy"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    fastcore.foundation
#    fastcore.imports
#    fastcore.utils
#    plum

PYPI_PACKAGE = "fasttransform"
