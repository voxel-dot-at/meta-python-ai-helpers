# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "The sweetest config system for Python"
HOMEPAGE = "https://github.com/explosion/confection"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1078676a9903ea0d111984467135785d"

SRC_URI[sha256sum] = "8e72dd3ca6bd4f48913cd220f10b8275978e740411654b6e8ca6d7008c590f0e"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "python-version-smaller-3-dot-8"
PACKAGECONFIG[python-version-smaller-3-dot-8] = ",,,python3-typing_extensions"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-pydantic python3-srsly"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-io python3-pickle python3-typing-extensions"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    catalogue
#    pathy
#    pydantic
#    pydantic.fields
#    pydantic.main
#    pydantic.types
#    pydantic.v1
#    pydantic.v1.fields
#    pydantic.v1.main
#    pydantic.v1.types
#    pytest

PYPI_PACKAGE = "confection"
